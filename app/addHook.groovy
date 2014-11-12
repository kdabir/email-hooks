def hook = new Hook(params.subMap(["sent_to", "post_to", "payload"]))
hook.user = user
hook.save()

log.info "$hook saved"

println "hook created"