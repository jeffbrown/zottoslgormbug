package zottoslgormbug

class Ccb {

    Ccb() {}

    Ccb(Long id) {
        this.id = id
    }

    static mapping = {
        id generator: 'assigned'
    }
}
