get "/", forward: "/index.groovy"
get "/hook", forward: "/addHook.html"
post "/hook", forward: "/addHook.groovy"

//email to: "/receiveEmail.groovy"
all "/_ah/mail/@sent_to", forward: "/receiveEmail.groovy?sent_to=@sent_to"
