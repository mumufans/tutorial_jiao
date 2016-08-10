
def tutorial = ec.entity.makeValue("tutorial.Tutorial")
tutorial.setFields(context, true, null, null)
EntityList tutorialList = ec.entity.find("tutorial.Tutorial").condition([name:name]).list()
if (!tutorial.tutorialId) tutorial.setSequencedIdPrimary()


if(tutorialList)
ec.message.addError('名称已存在')
tutorial.create()