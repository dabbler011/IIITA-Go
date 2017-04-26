package `in`.ac.iiita.go.models

import io.realm.RealmList
import io.realm.RealmObject
import io.realm.annotations.PrimaryKey
import java.util.*

/**
 * Created by betterclever on 4/16/2017.
 */

open class Lecture() : RealmObject() {

    @PrimaryKey open var _id: String? = null

    open var startTime: Long = 0

    open var endTime: Long = 0

    open var courseId: String? = null

    open var day: String? = null

    open var location: String? = null

    open var lectureType: String? = null

    open var teachersRef: RealmList<Faculty>? = null

    open var notificationEnabled: Boolean = false

    constructor(_id: String?, startTime: Long, endTime: Long, courseId: String?, day: String?, location: String?, lectureType: String?, teachersRef: RealmList<Faculty>?) : this() {
        this._id = _id
        this.startTime = startTime
        this.endTime = endTime
        this.courseId = courseId
        this.day = day
        this.location = location
        this.lectureType = lectureType
        this.teachersRef = teachersRef
    }
}

open class Faculty() : RealmObject() {

    @PrimaryKey open var _id: String? = null

    open var name: String? = null

    open var designation: String? = null

    open var office: String? = null

    open var primaryContact: String? = null

    open var email: String? = null

    constructor(_id: String?, name: String?, designation: String?, office: String?, primaryContact: String?, email: String?) : this() {
        this._id = _id
        this.name = name
        this.designation = designation
        this.office = office
        this.primaryContact = primaryContact
        this.email = email
    }
}


open class Course() : RealmObject() {
    @PrimaryKey open var _id: String? = null

    open var name: String? = null

    open var theory_credit: Int = 0

    open var lab_credit: Int = 0

    open var type: String? = null

    open var teachers: RealmList<Faculty>? = null

    constructor(_id: String?, name: String?, theory_credit: Int, lab_credit: Int, type: String?, teachers: RealmList<Faculty>?) : this() {
        this._id = _id
        this.name = name
        this.theory_credit = theory_credit
        this.lab_credit = lab_credit
        this.type = type
        this.teachers = teachers
    }
}

open class MessEvent() : RealmObject() {
    @PrimaryKey open var _id: String? = null

    open var name: String? = null

    open var designation: String? = null

    open var office: String? = null

    open var primaryContact: String? = null

    open var email: String? = null

    open var notificationEnabled = false

    constructor(_id: String?, name: String?, designation: String?, office: String?, primaryContact: String?, email: String?) : this() {
        this._id = _id
        this.name = name
        this.designation = designation
        this.office = office
        this.primaryContact = primaryContact
        this.email = email
    }
}

open class LibraryBook() : RealmObject() {
    @PrimaryKey open var accNo: String? = null

    open var name: String? = null

    open var issueDate: Date? = null

    open var additionalNotes: String? = null

    open var reminderEnabled = false

    constructor(accNo: String?, name: String?, issueDate: Date?, additionalNotes: String?, reminderEnabled: Boolean) : this() {
        this.accNo = accNo
        this.name = name
        this.issueDate = issueDate
        this.additionalNotes = additionalNotes
        this.reminderEnabled = reminderEnabled
    }
}
