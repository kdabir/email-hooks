def msg = mail.parseMessage(request)

log.info "Subject ${msg.subject}, to ${msg.allRecipients.join(', ')}, from ${msg.from[0]}"

forward "/post.groovy"
/// sent_to=${params.sent_to} gets carried over bcoz of forward