#%%
import json
import xmltodict
 
     
def convert(xml_file, xml_attribs=True):
    with open(xml_file, "rb") as f:    # notice the "rb" mode
        d = xmltodict.parse(f, xml_attribs=xml_attribs)
        return json.dumps(d, indent=4)

#%%
dir = 'D:\\Local\\digital_workflow\\java\\MongoConnector\\ModelParser\\'
fin = dir+"demo_model_v3_corrected_w_views.json"
fout = dir+"demo_model_v3_corrected_w_views_pretty_corrected2.json"
fout_ = dir+"demo_model_v3_corrected_w_views_pretty_corrected2_.json"

#%%
#import json
#from pprint import pprint

with open(fin) as data_file:    
    data=data_file.read()
data = data.replace('identifier','@identifier')
data = data.replace('source','@source')
data = data.replace('target','@target')
data = data.replace('identifierRef','@identifierRef')
data = data.replace('xsi:type','xsi_type')
data = data.replace('xsi_type','@xsi_type')
data = data.replace('"x"','"@x"')
data = data.replace('"y"','"@y"')
data = data.replace('"h"','"@h"')
data = data.replace('"w"','"@w"')
data = data.replace('"r"','"@r"')
data = data.replace('"g"','"@g"')
data = data.replace('"b"','"@b"')
data = data.replace('relationshipRef','@relationshipRef')
data = data.replace('elementRef','@elementRef')
data = data.replace('xml:lang','xml_lang')
data = data.replace('xml_lang','@xml_lang')
data = data.replace('"type"','"@xsi_type"')
data = data.replace('"mode"','"ar3_model"')
data = data.replace('"elements"','"ar3_elements"')
data = data.replace('"element"','"ar3_element"')
data = data.replace('"name"','"ar3_name"')
data = data.replace('"relationships"','"ar3_relationships"')
data = data.replace('"relationship"','"ar3_relationship"')
data = data.replace('"organizations"','"ar3_organizations"')
data = data.replace('"item"','"ar3_item"')
data = data.replace('"label"','"ar3_label"')
data = data.replace('"views"','"ar3_views"')
data = data.replace('"view"','"ar3_view"')
data = data.replace('"diagram"','"ar3_diagram"')
#data = data.replace('"node"','"ar3_node"')
data = data.replace('"nodes"','"ar3_node"')
#data = data.replace('"connection"','"ar3_connection"')
data = data.replace('"connections"','"ar3_connection"')
data = data.replace('"@xsi_type":"','"@xsi_type":"ar3_')
data = data.replace('"style"','"ar3_style"')
data = data.replace('"fillColor"','"ar3_fillColor"')
data = data.replace('"lineColor"','"ar3_lineColor"')
data = data.replace('"properties"','"ar3_properties"')
data = data.replace('"propertyDefinitionRef"','"ar3_propertyDefinitionRef"')
data = data.replace('"propertyDefinitions"','"ar3_propertyDefinitions"')
data = data.replace('"propertyDefinition"','"ar3_propertyDefinition"')
data = data.replace('"documentation"','"ar3_documentation"')
data = data.replace('version','@version')
data = data.replace('model','ar3_model')
data = data.replace('ar3_Metric','ar3_Driver')
#data = data.replace('ar3_Connection','ar3_Association')
data = data.replace('diagrams','ar3_diagrams')
data = data.replace('viewpointRef','ar3_viewpointRef')


#with open(fout) as data_file:    
data_ = json.loads(data)

model = data_['ar3_model']
del model['ar3_propertyDefinitions']

elems = model['ar3_elements']['ar3_element']
for elem in elems:
    del elem['ar3_properties']
    #elem_refs.append(elem['@identifier'])

rels = model['ar3_relationships']['ar3_relationship']
for rel in rels:
    if rel['@xsi_type']=='ar3_Connection':
        rels.remove(rel)
    if '@source' not in rel:
        rels.remove(rel)

node_ref = []
dels2 = []
views = model['ar3_views']['ar3_diagrams']['ar3_view']
for view in views:
    view['@xsi_type']="ar3_Diagram"
    nodes = view['ar3_node']
    del view['ar3_viewpointRef']
    refs = {}
    for node in nodes:
        if node['@identifier'] in node_ref:
            print("duplicate : "+str(node['@identifier']))
            if view not in dels2:
                dels2.append(view)
        node_ref.append(node['@identifier'])
        refs[node['@elementRef']]= node['@identifier'] 
        node['@xsi_type']="ar3_Element"
        del node['ar3_label']
        x = node['@x']/5
        del node['@x']
        node['@x'] = max(round(x),0)
        y = node['@y']/5
        del node['@y']
        node['@y'] = max(round(y),0)
        h = node['@h']/5
        del node['@h']
        node['@h'] = max(round(h),0)
        w = node['@w']/5
        del node['@w']
        node['@w'] = max(round(w),0)
    cons = view['ar3_connection']
    dels=[]
    for con in cons:
        refs[con['@relationshipRef']]= con['@identifier'] 
        con['@xsi_type']="ar3_Relationship"
        #        print(len(cons['@identifier']))
        #if '@source' not in con:
        #    dels.append(ii)
    ii=0
    for con in cons:
        #print(con)
        if (con['@source'] not in refs.keys()) or (con['@target'] not in refs.keys()):
            #cons.remove(con)
            dels = [ii] + dels
        else:
            con['@source'] = refs[con['@source']]
            con['@target'] = refs[con['@target']]
        ii=ii+1
        
    for jj in dels:
        del cons[jj]
    print(str(view['@identifier'])+": "+str(len(dels)))

for d in dels2:
    views.remove(d)
# need to reorder the elements in the 

foutFile = open(fout_, "w")

foutFile.write(json.dumps(data_,indent=2, sort_keys=True))
foutFile.flush()
foutFile.close()

