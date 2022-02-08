package zottoslgormbug

import grails.gorm.services.Service

@Service(Ccb)
abstract class CcbService {
    abstract Ccb save(Ccb ccb)

    List<Long> getSomeIds() {
        Ccb.withCriteria {
            between("id", 2l, 5l)
            projections {
                id()
            }
        }
    }
}
