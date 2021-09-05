#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME}#end

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

#parse("File Header.java")
class ${NAME} : RecyclerView.Adapter<${NAME}.${VIEWHOLDER_CLASS}>(){
    
    var myList: List<${ITEM_CLASS}> = ArrayList()
    private var parent: ViewGroup? = null
    fun submitMyList(myList:  List<${ITEM_CLASS}>) {
        this.myList = myList
        notifyDataSetChanged()
    }
    override fun getItemCount(): Int {
        return myList.size
    }
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ${VIEWHOLDER_CLASS} {
        val layoutInflater = LayoutInflater.from(parent.context)
        val itemBinding: ${BindingClass} =
            ${BindingClass}.inflate(layoutInflater, parent, false)
        this.parent = parent
        return ${VIEWHOLDER_CLASS}(itemBinding)
    }
    
    override fun onBindViewHolder(holder: ${VIEWHOLDER_CLASS}, position: Int) {
        holder.myItemTX = myList[position]
        holder.bind(holder.myItemTX!!)
    }
    
    inner class ${VIEWHOLDER_CLASS}(var itemBinding: ${BindingClass}) :
        RecyclerView.ViewHolder(itemBinding.root)  , View.OnClickListener{
        var myItemTX: ${ITEM_CLASS}? = null
        init {
        }

        fun bind(myItem: ${ITEM_CLASS}?) {
        }

        override fun onClick(v: View?) {
        }


    }
    
}
