package lFirst

import lombok.Data


@Data
class DeclareVariables {
    private lateinit var name: String
    private lateinit var notice: String

    fun setName(namex: String) {
        this.name = namex
    }

    fun setNotice(noticex: String) {
        this.notice = noticex
    }

    fun getName(): String {
        return this.name
    }

    fun getNotice(): String {
        return this.notice
    }
}