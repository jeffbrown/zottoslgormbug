package zottoslgormbug

class BootStrap {
     CcbService ccbService

    def init = { servletContext ->
        ccbService.save(new Ccb(1))
        ccbService.save(new Ccb(2))
        ccbService.save(new Ccb(3))

    }
    def destroy = {
    }
}
