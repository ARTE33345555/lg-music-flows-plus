class RoomSetupActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_room_setup)

        val btnNext: Button = findViewById(R.id.btnNext)
        val btnBack: Button = findViewById(R.id.btnBack)
        val editRoomName: EditText = findViewById(R.id.editRoomName)

        btnNext.setOnClickListener {
            val roomName = editRoomName.text.toString()
            if(roomName.isNotEmpty()){
                val intent = Intent(this, MainAppActivity::class.java)
                intent.putExtra("ROOM_NAME", roomName)
                startActivity(intent)
            } else {
                Toast.makeText(this, "Enter a name for your speaker", Toast.LENGTH_SHORT).show()
            }
        }

        btnBack.setOnClickListener { finish() }
    }
}
