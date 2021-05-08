package pl.kowalczyk92.mvvm

import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.LiveData
import androidx.lifecycle.Observer

fun <T> LiveData<T>.observe(lifecycleOwner: LifecycleOwner, body: (newData: T) -> Unit) {
    observe(lifecycleOwner, Observer { newData ->
        if (newData != null) body(newData)
    })
}