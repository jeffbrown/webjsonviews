package webjsonviews

class BootStrap {

    def init = { servletContext ->
        new demo.Person(firstName: 'Jeff', lastName: 'Brown').save()
        new demo.Person(firstName: 'Jake', lastName: 'Brown').save()
    }
    def destroy = {
    }
}
