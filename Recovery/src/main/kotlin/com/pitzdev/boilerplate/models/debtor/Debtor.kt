package com.pitzdev.boilerplate.models.debtor

import javax.persistence.*
import com.pitzdev.boilerplate.models.base.BaseEntity

@Entity
data class Debtor(var publicId: String = "",
                  var name: String = "",
                  var address: String = "",
                  var addressNumber: String = "",
                  var neighborhood: String = "",
                  var postalCode: Long? = null,
                  var complement: String? = null,
                  var ibgeCityCode: String = "",
                  var state: String = "") : BaseEntity()