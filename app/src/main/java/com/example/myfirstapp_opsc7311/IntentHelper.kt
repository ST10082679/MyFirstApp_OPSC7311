package com.example.myfirstapp_opsc7311

import android.content.Context
import android.content.Intent
import android.app.Activity
import android.os.Bundle

fun openIntent (activity: Activity, order: String, activityToOpen: Class<*>)
{
    //Cast the context to an activity context
    val activityContext = activity as? Activity ?: return

    //declare intent with context and class to pass the value to
    val intent = Intent(activity, activityToOpen)

    //pass through the string value with jey order
    intent.putExtra("order", order)

    //start activity
    activity.startActivity(intent)
}

fun shareIntent(context: Context, order: String)
{
    val sendIntent = Intent()

    sendIntent.setAction(Intent.ACTION_SEND)

    sendIntent.putExtra(Intent.EXTRA_TEXT, order)

    sendIntent.setType("text/plain")

    val shareIntent = Intent.createChooser(sendIntent, null)

    context.startActivity(shareIntent)
}

fun shareIntent(context: Context, order: Order)
{
    val sendIntent = Intent()

    sendIntent.setAction(Intent.ACTION_SEND)

    val shareOrderDetails = Bundle()

    shareOrderDetails.putString("productName", order.productName)
    shareOrderDetails.putString("customerName", order.customerName)
    shareOrderDetails.putString("customerCell", order.customerCell)

    sendIntent.putExtra(Intent.EXTRA_TEXT, shareOrderDetails)

    sendIntent.setType("text/plain")

    val shareIntent = Intent.createChooser(sendIntent, null)

    context.startActivity(shareIntent)
}



