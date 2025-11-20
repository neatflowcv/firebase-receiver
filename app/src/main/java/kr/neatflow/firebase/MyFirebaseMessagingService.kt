package kr.neatflow.firebase

import android.util.Log
import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage

class MyFirebaseMessagingService : FirebaseMessagingService() {
    override fun onMessageReceived(message: RemoteMessage) {
        super.onMessageReceived(message)

        val title = message.notification?.title ?: "알림"
        val body = message.notification?.body ?: "메시지가 도착했습니다"

        Log.d(kr.neatflow.firebase.TAG, "서버로 토큰 전송: $title $body")
    }
}
