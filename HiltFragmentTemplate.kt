#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME}#end

import android.view.View
import androidx.fragment.app.viewModels
import dagger.hilt.android.AndroidEntryPoint
import timber.log.Timber

#parse("File Header.java")
@AndroidEntryPoint
class ${NAME} : BaseFragment<${ViewModelClass} , ${BindingLayout}>() {

    override fun getContentView(): Int {
        return R.layout.${layout_reource}
    }

    override fun initView() {
    }

    override fun onClick(v: View) {
    }

    override fun initializeViewModel() {
        val viewModel: ${ViewModelClass} by viewModels()
        baseViewModel = viewModel
    }
}
