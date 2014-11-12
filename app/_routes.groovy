get "/", forward: "/index.groovy"
//email to: "/receiveEmail.groovy"
all "/_ah/mail/@sent_to", forward: "/receiveEmail.groovy?sent_to=@sent_to"
