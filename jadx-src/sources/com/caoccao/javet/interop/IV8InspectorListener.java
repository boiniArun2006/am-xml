package com.caoccao.javet.interop;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public interface IV8InspectorListener {
    void flushProtocolNotifications();

    void receiveNotification(String str);

    void receiveResponse(String str);

    void runIfWaitingForDebugger(int i2);

    void sendRequest(String str);
}
