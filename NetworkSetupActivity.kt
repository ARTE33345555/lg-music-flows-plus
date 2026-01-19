class NetworkSetupActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_network_setup)

        val btnNext: Button = findViewById(R.id.btnNext)
        val btnBack: Button = findViewById(R.id.btnBack)
        val wifiOption: RadioButton = findViewById(R.id.wifiOption)
        val ethernetOption: RadioButton = findViewById(R.id.ethernetOption)

        btnNext.setOnClickListener {
            if (wifiOption.isChecked || ethernetOption.isChecked) {
                startActivity(Intent(this, RoomSetupActivity::class.java))
            } else {
                Toast.makeText(this, "Please select network type", Toast.LENGTH_SHORT).show()
            }
        }

        btnBack.setOnClickListener { finish() }
    }
}
