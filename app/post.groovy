def hook = Hook.get(params.sent_to)

def resp = new URL(hook.post_to).post(payload:hook.payload.bytes)

