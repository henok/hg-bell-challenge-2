package com.bell.interview.henokanswermobile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import kotlinx.android.synthetic.main.activity_main.*
import com.bell.interview.henokanswermobile.viewmodel.MainViewModel
import com.bell.interview.henokanswermobile.viewmodel.MainViewModelFactory
import io.reactivex.disposables.CompositeDisposable

/**
 * Main Activity
 * Contains a welcome message, a button and a pop-message that displays the last modified date.
 */
class MainActivity : AppCompatActivity() {
    val disposable = CompositeDisposable()
    lateinit var viewModel : MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // View model should be the only code this activity interacts with.
        viewModel = ViewModelProvider(this, MainViewModelFactory()).get(MainViewModel::class.java)

        // Setup on-click listener of our main button
        click_me_button.setOnClickListener {
            disposable.add (
                viewModel.getLastModifiedDate("69585")
                .subscribe (
                    {
                        AlertDialog.Builder(this@MainActivity)
                            .setTitle("Last Modified Date")
                            .setMessage("Date: $it")
                            .create()
                            .show()

                    },
                    {
                        println("Error, unable to show human readable date $it")
                        AlertDialog.Builder(this@MainActivity)
                            .setTitle("ERROR - Last Modified Date")
                            .setMessage("Error, unable to show human readable date $it")
                            .create()
                            .show()
                    }
                )
            )
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        disposable.clear()
    }
}
