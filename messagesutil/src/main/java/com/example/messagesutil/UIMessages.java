package com.example.messagesutil;

import android.content.Context;
import android.widget.Toast;

public class UIMessages {
    /**
     * Show short Android Toast message
     * @param context = Activity Context to Show Toast on
     * @param message = Text for Toast Message
     */
    public static void showToast(Context context, String message){
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }
}
