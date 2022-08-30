package islom.din.multiviewholder

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import java.util.*

class MessageAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    var messages: List<Message> = ArrayList<Message>()
        @SuppressLint("NotifyDataSetChanged")
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    override fun getItemViewType(position: Int): Int {
        val element = messages[position]
        return if (element.isText) ITEM_TEXT_VIEW
        else ITEM_IMAGE_VIEW
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return if (viewType == ITEM_TEXT_VIEW) {
            TextViewHolder(
                LayoutInflater.from(parent.context).inflate(R.layout.rv_item_text, parent, false)
            )
        } else {
            ImageViewHolder(
                LayoutInflater.from(parent.context).inflate(R.layout.rv_item_image, parent, false)
            )
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is TextViewHolder) {
            holder.bind(messages[position])
        } else {

        }
    }

    override fun getItemCount(): Int {
        return messages.size
    }

    inner class TextViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val text: TextView = itemView.findViewById(R.id.text)
        fun bind(message: Message) {
            text.text = message.title
        }
    }

    inner class ImageViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    companion object {
        private const val ITEM_TEXT_VIEW = 1
        private const val ITEM_IMAGE_VIEW = 2
    }
}