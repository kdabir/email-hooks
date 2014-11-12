import com.google.appengine.api.users.User
import groovyx.gaelyk.datastore.Key

@groovyx.gaelyk.datastore.Entity
class Hook {
    @Key String sent_to
    String post_to
    String payload
    Date dateAdded = new Date()
    User user
}
