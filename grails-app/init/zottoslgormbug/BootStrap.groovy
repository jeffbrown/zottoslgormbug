package zottoslgormbug

class BootStrap {
     CcbService ccbService

    def init = { servletContext ->
        ccbService.save(1)
        ccbService.save(2)
        ccbService.save(3)
    }
    def destroy = {
    }
}
