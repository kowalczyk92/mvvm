package pl.kowalczyk92.mvvm

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment

abstract class BaseFragment : Fragment(), BaseView {

    abstract val layout: Int

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): android.view.View? = inflater.inflate(layout, container, false)

    override fun showError(resId: Int) {
        activity?.let { Toast.makeText(it, getString(resId), Toast.LENGTH_LONG).show() }
    }
}
