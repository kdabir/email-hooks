
app {
    name="email-hooks"
    version="1"
    inbound_services= ["email"]
}

web {
     security = [
            '*' : ['/add/*'],
            'admin': ["/_ah/mail/*"]
        ]
}