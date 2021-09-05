#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME}#end

import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

#parse("File Header.java")
@HiltViewModel
class ${NAME} @Inject constructor(): BaseViewModel()  {
    override fun stop() {
    }

    override fun start() {
    }

}
