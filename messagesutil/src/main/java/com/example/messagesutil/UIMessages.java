package com.example.messagesutil;

import android.app.AlertDialog;
import android.content.Context;
import android.widget.Toast;

public class UIMessages {
    /**
     * Show short android toast message
     * @param context = Activity context to show toast on
     * @param message = Text for toast message
     */
    public static void showToast(Context context, String message){
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }

    /**
     * Show Long android toast message
     * @param context = Activity context to show toast on
     * @param message = Text for toast message
     */
    public static void showLongToast(Context context, String message){
        Toast.makeText(context, message, Toast.LENGTH_LONG).show();
    }

    /**
     * Show message in a dialog with custom title
     * @param context = Activity context to show dialog message
     * @param message = Text for dialog message
     * @param Title  = Text for custom dialog title
     */
    public static void showMessage(Context context, String message, String Title){
        //Create Alert Dialog Builder
        AlertDialog.Builder dialog_builder = new AlertDialog.Builder(context);
        //Setup Alert Dialog Builder
        dialog_builder.setTitle(Title);
        dialog_builder.setMessage(message);
        //Build Dialog
        AlertDialog dialog = dialog_builder.create();
        //Show Dialog
        dialog.show();
    }

    /**
     * Show message in a dialog with default title
     * @param context = Activity context to show dialog message
     * @param message = Text for dialog message
     */
    public static void showMessage(Context context, String message){
        showMessage(context, message, "Alert");
    }
}
