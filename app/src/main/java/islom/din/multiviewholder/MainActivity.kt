package islom.din.multiviewholder

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import islom.din.multiviewholder.databinding.ActivityMainBinding
import java.util.*

class MainActivity : AppCompatActivity() {

    private var _binding: ActivityMainBinding? = null
    private val binding get() = _binding!!

    private val adapter = MessageAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        adapter.messages = getList()

        binding.list.adapter = adapter
        binding.list.hasFixedSize()
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

    fun getList(): List<Message> {
        val list = ArrayList<Message>()
        list.add(Message(title = "Hello world"))
        list.add(Message(title = "Some another text"))
        list.add(Message(isText = false))
        list.add(Message(title = "This is text :)"))
        list.add(Message(isText = false))
        list.add(Message(title = "Yo this is text"))
        list.add(Message(title = "54534534"))
        list.add(Message(title = "Yo this is text"))
        list.add(Message(title = "54534534"))
        list.add(Message(title = "Yo this is text"))
        list.add(Message(title = "54534534"))
        list.add(Message(title = "Yo this is text"))
        list.add(Message(title = "54534534"))
        list.add(Message(title = "Yo this is text"))
        list.add(Message(title = "54534534"))
        list.add(Message(title = "Yo this is text"))
        list.add(Message(title = "54534534"))
        list.add(Message(title = "Yo this is text"))
        list.add(Message(title = "54534534"))
        list.add(Message(title = "Yo this is text"))
        list.add(Message(title = "54534534"))
        list.add(Message(title = "Yo this is text"))
        list.add(Message(title = "54534534"))
        list.add(Message(title = "-> : ) !!!!"))
        list.add(Message(isText = false))
        list.add(Message(title = "This is text :)"))
        list.add(Message(title = "Ilmhona"))
        list.add(Message(title = "Yo this is text"))
        list.add(Message(title = "54534534"))
        list.add(Message(title = "Yo this is text"))
        list.add(Message(title = "54534534"))
        list.add(Message(title = "Yo this is text"))
        list.add(Message(title = "54534534"))
        list.add(Message(title = "Yo this is text"))
        list.add(Message(title = "54534534"))
        return list
    }
}