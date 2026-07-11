package com.fyber.inneractive.sdk.player.controller;

import android.view.View;
import com.fyber.inneractive.sdk.config.enums.Orientation;
import com.fyber.inneractive.sdk.util.g1;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public interface g0 extends com.fyber.inneractive.sdk.ui.controller.c {
    com.fyber.inneractive.sdk.util.d0 a(g1 g1Var, com.fyber.inneractive.sdk.util.g gVar);

    com.fyber.inneractive.sdk.util.d0 a(String str, g1 g1Var, boolean z2);

    void a(int i2, boolean z2);

    void a(View view);

    void a(View view, String str);

    void a(String str, String str2);

    void a(boolean z2);

    void a(boolean z2, Orientation orientation);

    void c();

    void e();

    void f();

    void g();

    void h();

    void i();

    void j();

    com.fyber.inneractive.sdk.ignite.m o();

    void onPlayerError();

    void onProgress(int i2, int i3);
}
