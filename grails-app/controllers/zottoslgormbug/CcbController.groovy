package zottoslgormbug

class CcbController {

    CcbService ccbService

    def index() {
        def results = ccbService.someIds

        render results
    }
}
