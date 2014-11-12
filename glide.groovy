
app {
    name = "email-hooks"
    version = "1"
    inbound_services = ["mail"]
}

web {
     security = [
            '*' : ['/hook/*'],
            'admin': ["/_ah/mail/*"]
        ]
}