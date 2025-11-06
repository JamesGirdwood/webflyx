package mobiledev.unb.ca.labexam

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import com.google.android.material.progressindicator.CircularProgressIndicator
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.RecyclerView
import mobiledev.unb.ca.labexam.repositories.SharedPreferencesManager
import mobiledev.unb.ca.labexam.utils.LoadDataTask

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var loadDataTask: LoadDataTask
    private lateinit var circularProgressIndicator: CircularProgressIndicator

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Ensure app is running in light mode
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)

        initSharedPreferences()

        // TODO 1
        //  Get a reference to the RecyclerView
        recyclerView = findViewById(R.id.recyclerView)

        // TODO 2
        //  Get a reference to the progress indicator
        circularProgressIndicator = findViewById(R.id.circularProgressIndicator)

        // TODO 3
        //  Create an instance of LoadDataTask using this activity in the constructor
        //  and use the setters to pass in the recycler view and progress indicator
        //  objects needed during execution
        //loadDataTask = LoadDataTask()
    }

    private fun initSharedPreferences() {
        SharedPreferencesManager.init(applicationContext)
    }
}