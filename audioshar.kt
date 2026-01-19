class MainAppActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_app)

        val roomName = intent.getStringExtra("ROOM_NAME")
        val welcomeRoom: TextView = findViewById(R.id.welcomeRoom)
        welcomeRoom.text = "Room: $roomName"

        // Здесь можно добавить Tabs / ViewPager для вкладок:
        // Главная, Стриминг, Настройки, AudioShar
    }
}
