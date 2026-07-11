package androidx.browser.customtabs;

import P.j;
import android.app.PendingIntent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public class CustomTabsSessionToken {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final P.j f14583n;
    private final PendingIntent rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final CustomTabsCallback f14584t;

    static class MockCallback extends j.AbstractBinderC0258j {
        @Override // P.j
        public void FX(Bundle bundle) {
        }

        @Override // P.j
        public void M(Bundle bundle) {
        }

        @Override // P.j
        public void a(int i2, int i3, Bundle bundle) {
        }

        @Override // P.j.AbstractBinderC0258j, android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // P.j
        public Bundle ck(String str, Bundle bundle) {
            return null;
        }

        @Override // P.j
        public void dR0(int i2, Bundle bundle) {
        }

        @Override // P.j
        public void gh(int i2, int i3, int i5, int i7, int i8, Bundle bundle) {
        }

        @Override // P.j
        public void m(String str, Bundle bundle) {
        }

        @Override // P.j
        public void nY(String str, Bundle bundle) {
        }

        @Override // P.j
        public void ofS(int i2, Uri uri, boolean z2, Bundle bundle) {
        }

        @Override // P.j
        public void pJg(Bundle bundle) {
        }

        @Override // P.j
        public void te(Bundle bundle) {
        }
    }

    private IBinder rl() {
        P.j jVar = this.f14583n;
        if (jVar != null) {
            return jVar.asBinder();
        }
        throw new IllegalStateException("CustomTabSessionToken must have valid binder or pending session");
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof CustomTabsSessionToken)) {
            return false;
        }
        CustomTabsSessionToken customTabsSessionToken = (CustomTabsSessionToken) obj;
        PendingIntent pendingIntentT = customTabsSessionToken.t();
        PendingIntent pendingIntent = this.rl;
        if ((pendingIntent == null) != (pendingIntentT == null)) {
            return false;
        }
        return pendingIntent != null ? pendingIntent.equals(pendingIntentT) : rl().equals(customTabsSessionToken.rl());
    }

    public int hashCode() {
        PendingIntent pendingIntent = this.rl;
        return pendingIntent != null ? pendingIntent.hashCode() : rl().hashCode();
    }

    IBinder n() {
        P.j jVar = this.f14583n;
        if (jVar == null) {
            return null;
        }
        return jVar.asBinder();
    }

    PendingIntent t() {
        return this.rl;
    }

    CustomTabsSessionToken(P.j jVar, PendingIntent pendingIntent) {
        CustomTabsCallback customTabsCallback;
        if (jVar == null && pendingIntent == null) {
            throw new IllegalStateException("CustomTabsSessionToken must have either a session id or a callback (or both).");
        }
        this.f14583n = jVar;
        this.rl = pendingIntent;
        if (jVar == null) {
            customTabsCallback = null;
        } else {
            customTabsCallback = new CustomTabsCallback() { // from class: androidx.browser.customtabs.CustomTabsSessionToken.1
                @Override // androidx.browser.customtabs.CustomTabsCallback
                public void extraCallback(String str, Bundle bundle) {
                    try {
                        CustomTabsSessionToken.this.f14583n.nY(str, bundle);
                    } catch (RemoteException unused) {
                        Log.e("CustomTabsSessionToken", "RemoteException during ICustomTabsCallback transaction");
                    }
                }

                @Override // androidx.browser.customtabs.CustomTabsCallback
                public Bundle extraCallbackWithResult(String str, Bundle bundle) {
                    try {
                        return CustomTabsSessionToken.this.f14583n.ck(str, bundle);
                    } catch (RemoteException unused) {
                        Log.e("CustomTabsSessionToken", "RemoteException during ICustomTabsCallback transaction");
                        return null;
                    }
                }

                @Override // androidx.browser.customtabs.CustomTabsCallback
                public void onActivityLayout(int i2, int i3, int i5, int i7, int i8, Bundle bundle) {
                    try {
                        CustomTabsSessionToken.this.f14583n.gh(i2, i3, i5, i7, i8, bundle);
                    } catch (RemoteException unused) {
                        Log.e("CustomTabsSessionToken", "RemoteException during ICustomTabsCallback transaction");
                    }
                }

                @Override // androidx.browser.customtabs.CustomTabsCallback
                public void onActivityResized(int i2, int i3, Bundle bundle) {
                    try {
                        CustomTabsSessionToken.this.f14583n.a(i2, i3, bundle);
                    } catch (RemoteException unused) {
                        Log.e("CustomTabsSessionToken", "RemoteException during ICustomTabsCallback transaction");
                    }
                }

                @Override // androidx.browser.customtabs.CustomTabsCallback
                public void onMessageChannelReady(Bundle bundle) {
                    try {
                        CustomTabsSessionToken.this.f14583n.pJg(bundle);
                    } catch (RemoteException unused) {
                        Log.e("CustomTabsSessionToken", "RemoteException during ICustomTabsCallback transaction");
                    }
                }

                @Override // androidx.browser.customtabs.CustomTabsCallback
                public void onMinimized(Bundle bundle) {
                    try {
                        CustomTabsSessionToken.this.f14583n.M(bundle);
                    } catch (RemoteException unused) {
                        Log.e("CustomTabsSessionToken", "RemoteException during ICustomTabsCallback transaction");
                    }
                }

                @Override // androidx.browser.customtabs.CustomTabsCallback
                public void onNavigationEvent(int i2, Bundle bundle) {
                    try {
                        CustomTabsSessionToken.this.f14583n.dR0(i2, bundle);
                    } catch (RemoteException unused) {
                        Log.e("CustomTabsSessionToken", "RemoteException during ICustomTabsCallback transaction");
                    }
                }

                @Override // androidx.browser.customtabs.CustomTabsCallback
                public void onPostMessage(String str, Bundle bundle) {
                    try {
                        CustomTabsSessionToken.this.f14583n.m(str, bundle);
                    } catch (RemoteException unused) {
                        Log.e("CustomTabsSessionToken", "RemoteException during ICustomTabsCallback transaction");
                    }
                }

                @Override // androidx.browser.customtabs.CustomTabsCallback
                public void onRelationshipValidationResult(int i2, Uri uri, boolean z2, Bundle bundle) {
                    try {
                        CustomTabsSessionToken.this.f14583n.ofS(i2, uri, z2, bundle);
                    } catch (RemoteException unused) {
                        Log.e("CustomTabsSessionToken", "RemoteException during ICustomTabsCallback transaction");
                    }
                }

                @Override // androidx.browser.customtabs.CustomTabsCallback
                public void onUnminimized(Bundle bundle) {
                    try {
                        CustomTabsSessionToken.this.f14583n.FX(bundle);
                    } catch (RemoteException unused) {
                        Log.e("CustomTabsSessionToken", "RemoteException during ICustomTabsCallback transaction");
                    }
                }

                @Override // androidx.browser.customtabs.CustomTabsCallback
                public void onWarmupCompleted(Bundle bundle) {
                    try {
                        CustomTabsSessionToken.this.f14583n.te(bundle);
                    } catch (RemoteException unused) {
                        Log.e("CustomTabsSessionToken", "RemoteException during ICustomTabsCallback transaction");
                    }
                }
            };
        }
        this.f14584t = customTabsCallback;
    }
}
