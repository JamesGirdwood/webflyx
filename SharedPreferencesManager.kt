package mobiledev.unb.ca.labexam.repositories

import android.content.Context
import android.content.SharedPreferences
import androidx.core.content.edit

// Singleton instance access object for working with SharedPreferences
//  NOTE:
//   - An object declaration is a concise way of creating a singleton class
//     without the need to define a class and a companion object.
object SharedPreferencesManager {
    private const val PREF_NAME = "EventPrefs"
    private lateinit var  sharedPreferences: SharedPreferences
    fun init(context: Context) {
        // TODO: SharedPreferences
        //  Setup the instance of shared preferences you will be using
        sharedPreferences = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE)
    }

    fun saveBooleanValue(key: String, value: Boolean) {
        // TODO: Shared Preferences
        //  Save the boolean value for the specified key
        //  Hint: https://developer.android.com/reference/android/content/SharedPreferences.Editor.html#putBoolean(java.lang.String,%20boolean)
        sharedPreferences.edit { putBoolean(key, value) }
    }

    fun getBooleanValue(key: String, defaultValue: Boolean): Boolean {
        // TODO: SharedPreferences
        //  Return the boolean value for the specified key
        return sharedPreferences.getBoolean(key, defaultValue)
    }
}
