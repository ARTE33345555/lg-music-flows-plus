class WelcomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        val btnNext: Button = findViewById(R.id.btnNext)
        val btnExit: Button = findViewById(R.id.btnExit)

        btnNext.setOnClickListener {
            startActivity(Intent(this, NetworkSetupActivity::class.java))
        }

        btnExit.setOnClickListener { finish() }
    }
}
