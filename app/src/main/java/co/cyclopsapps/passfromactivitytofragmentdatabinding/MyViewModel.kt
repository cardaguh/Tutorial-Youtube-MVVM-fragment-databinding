package co.cyclopsapps.passfromactivitytofragmentdatabinding

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

/**
 * Created by Carlos Daniel Agudelo on 16/05/2021.
 */
class MyViewModel: ViewModel() {

    private val _showMessage = MutableLiveData<Boolean>()
    val showMessage: LiveData<Boolean> = _showMessage
    // get() = _showMessage

    fun startShowMessage() {
        _showMessage.value = true
    }

    fun endShowMessage() {
        _showMessage.value = null
    }
}