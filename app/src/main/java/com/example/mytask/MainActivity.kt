import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import com.example.mytask.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main) // Ensure this matches your layout file


        val fullName = findViewById<EditText>(R.id.fullName)
        val email = findViewById<EditText>(R.id.email)
        val password = findViewById<EditText>(R.id.password)
        val genderGroup = findViewById<RadioGroup>(R.id.genderGroup)
        val countrySpinner = findViewById<Spinner>(R.id.countrySpinner)
        val cityAutocomplete = findViewById<AutoCompleteTextView>(R.id.cityAutocomplete)
        val termsCheckbox = findViewById<CheckBox>(R.id.termsCheckbox)
        val submitButton = findViewById<Button>(R.id.submitButton)


        val countries = resources.getStringArray(R.array.countries)
        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, countries)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        countrySpinner.adapter = adapter


        val cities = resources.getStringArray(R.array.cities)
        val cityAdapter = ArrayAdapter(this, android.R.layout.simple_dropdown_item_1line, cities)
        cityAutocomplete.setAdapter(cityAdapter)


        submitButton.setOnClickListener {

            val selectedGenderId = genderGroup.checkedRadioButtonId
            val gender = findViewById<RadioButton>(selectedGenderId)?.text?.toString()


            val country = countrySpinner.selectedItem?.toString()
            val city = cityAutocomplete.text?.toString()


            val termsAccepted = termsCheckbox.isChecked


            Toast.makeText(
                this,
                "Name: ${fullName.text}\nEmail: ${email.text}\nGender: $gender\nCountry: $country\nCity: $city\nTerms Accepted: $termsAccepted",
                Toast.LENGTH_LONG
            ).show()
        }
    }
}
