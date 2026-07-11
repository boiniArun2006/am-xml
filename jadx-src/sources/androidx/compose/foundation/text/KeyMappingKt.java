package androidx.compose.foundation.text;

import androidx.compose.ui.input.key.Key;
import androidx.compose.ui.input.key.KeyEvent;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.PropertyReference1Impl;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a#\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\"\u001a\u0010\n\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lkotlin/Function1;", "Landroidx/compose/ui/input/key/KeyEvent;", "", "shortcutModifier", "Landroidx/compose/foundation/text/KeyMapping;", c.f62177j, "(Lkotlin/jvm/functions/Function1;)Landroidx/compose/foundation/text/KeyMapping;", "Landroidx/compose/foundation/text/KeyMapping;", "rl", "()Landroidx/compose/foundation/text/KeyMapping;", "defaultKeyMapping", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class KeyMappingKt {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final KeyMapping f19726n;

    static {
        final KeyMapping keyMappingN = n(new PropertyReference1Impl() { // from class: androidx.compose.foundation.text.KeyMappingKt$defaultKeyMapping$1
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return Boolean.valueOf(KeyEvent_androidKt.O(((KeyEvent) obj).getNativeKeyEvent()));
            }
        });
        f19726n = new KeyMapping() { // from class: androidx.compose.foundation.text.KeyMappingKt$defaultKeyMapping$2$1
            @Override // androidx.compose.foundation.text.KeyMapping
            public KeyCommand n(android.view.KeyEvent event) {
                KeyCommand keyCommand = null;
                if (KeyEvent_androidKt.J2(event) && KeyEvent_androidKt.O(event)) {
                    long jN = KeyEvent_androidKt.n(event);
                    MappedKeys mappedKeys = MappedKeys.f19781n;
                    if (Key.r(jN, mappedKeys.xMQ())) {
                        keyCommand = KeyCommand.f19724z;
                    } else if (Key.r(jN, mappedKeys.mUb())) {
                        keyCommand = KeyCommand.piY;
                    } else if (Key.r(jN, mappedKeys.gh())) {
                        keyCommand = KeyCommand.f19719m;
                    } else if (Key.r(jN, mappedKeys.KN())) {
                        keyCommand = KeyCommand.ijL;
                    }
                } else if (KeyEvent_androidKt.O(event)) {
                    long jN2 = KeyEvent_androidKt.n(event);
                    MappedKeys mappedKeys2 = MappedKeys.f19781n;
                    if (Key.r(jN2, mappedKeys2.xMQ())) {
                        keyCommand = KeyCommand.f19721r;
                    } else if (Key.r(jN2, mappedKeys2.mUb())) {
                        keyCommand = KeyCommand.J2;
                    } else if (Key.r(jN2, mappedKeys2.gh())) {
                        keyCommand = KeyCommand.f19714Z;
                    } else if (Key.r(jN2, mappedKeys2.KN())) {
                        keyCommand = KeyCommand.f19720o;
                    } else if (Key.r(jN2, mappedKeys2.az())) {
                        keyCommand = KeyCommand.p5;
                    } else if (Key.r(jN2, mappedKeys2.Uo())) {
                        keyCommand = KeyCommand.f19706M;
                    } else if (Key.r(jN2, mappedKeys2.t())) {
                        keyCommand = KeyCommand.f19700E;
                    } else if (Key.r(jN2, mappedKeys2.rl())) {
                        keyCommand = KeyCommand.f19698C;
                    }
                } else if (KeyEvent_androidKt.J2(event)) {
                    long jN3 = KeyEvent_androidKt.n(event);
                    MappedKeys mappedKeys3 = MappedKeys.f19781n;
                    if (Key.r(jN3, mappedKeys3.ck())) {
                        keyCommand = KeyCommand.eTf;
                    } else if (Key.r(jN3, mappedKeys3.HI())) {
                        keyCommand = KeyCommand.xg;
                    }
                } else if (KeyEvent_androidKt.nr(event)) {
                    long jN4 = KeyEvent_androidKt.n(event);
                    MappedKeys mappedKeys4 = MappedKeys.f19781n;
                    if (Key.r(jN4, mappedKeys4.t())) {
                        keyCommand = KeyCommand.f19701FX;
                    } else if (Key.r(jN4, mappedKeys4.Uo())) {
                        keyCommand = KeyCommand.f19697B;
                    }
                }
                if (keyCommand == null) {
                    return keyMappingN.n(event);
                }
                return keyCommand;
            }
        };
    }

    public static final KeyMapping n(final Function1 function1) {
        return new KeyMapping() { // from class: androidx.compose.foundation.text.KeyMappingKt$commonKeyMapping$1
            @Override // androidx.compose.foundation.text.KeyMapping
            public KeyCommand n(android.view.KeyEvent event) {
                if (((Boolean) function1.invoke(KeyEvent.n(event))).booleanValue() && KeyEvent_androidKt.J2(event)) {
                    if (Key.r(KeyEvent_androidKt.n(event), MappedKeys.f19781n.ViF())) {
                        return KeyCommand.eWT;
                    }
                    return null;
                }
                if (((Boolean) function1.invoke(KeyEvent.n(event))).booleanValue()) {
                    long jN = KeyEvent_androidKt.n(event);
                    MappedKeys mappedKeys = MappedKeys.f19781n;
                    if (Key.r(jN, mappedKeys.nr()) ? true : Key.r(jN, mappedKeys.ty())) {
                        return KeyCommand.f19711U;
                    }
                    if (Key.r(jN, mappedKeys.S())) {
                        return KeyCommand.P5;
                    }
                    if (Key.r(jN, mappedKeys.WPU())) {
                        return KeyCommand.M7;
                    }
                    if (Key.r(jN, mappedKeys.n())) {
                        return KeyCommand.f19705J;
                    }
                    if (Key.r(jN, mappedKeys.aYN())) {
                        return KeyCommand.eWT;
                    }
                    if (Key.r(jN, mappedKeys.ViF())) {
                        return KeyCommand.fcU;
                    }
                    return null;
                }
                if (KeyEvent_androidKt.O(event)) {
                    return null;
                }
                if (KeyEvent_androidKt.J2(event)) {
                    long jN2 = KeyEvent_androidKt.n(event);
                    MappedKeys mappedKeys2 = MappedKeys.f19781n;
                    if (Key.r(jN2, mappedKeys2.xMQ())) {
                        return KeyCommand.f19699D;
                    }
                    if (Key.r(jN2, mappedKeys2.mUb())) {
                        return KeyCommand.f19715a;
                    }
                    if (Key.r(jN2, mappedKeys2.gh())) {
                        return KeyCommand.f19704I;
                    }
                    if (Key.r(jN2, mappedKeys2.KN())) {
                        return KeyCommand.f19703GR;
                    }
                    if (Key.r(jN2, mappedKeys2.o())) {
                        return KeyCommand.Nxk;
                    }
                    if (Key.r(jN2, mappedKeys2.r())) {
                        return KeyCommand.f19713Y;
                    }
                    if (Key.r(jN2, mappedKeys2.ck())) {
                        return KeyCommand.eTf;
                    }
                    if (Key.r(jN2, mappedKeys2.HI())) {
                        return KeyCommand.xg;
                    }
                    if (Key.r(jN2, mappedKeys2.ty())) {
                        return KeyCommand.P5;
                    }
                    return null;
                }
                long jN3 = KeyEvent_androidKt.n(event);
                MappedKeys mappedKeys3 = MappedKeys.f19781n;
                if (Key.r(jN3, mappedKeys3.xMQ())) {
                    return KeyCommand.f19722t;
                }
                if (Key.r(jN3, mappedKeys3.mUb())) {
                    return KeyCommand.f19708O;
                }
                if (Key.r(jN3, mappedKeys3.gh())) {
                    return KeyCommand.f19712X;
                }
                if (Key.r(jN3, mappedKeys3.KN())) {
                    return KeyCommand.f19710T;
                }
                if (Key.r(jN3, mappedKeys3.o())) {
                    return KeyCommand.f19707N;
                }
                if (Key.r(jN3, mappedKeys3.r())) {
                    return KeyCommand.f19723v;
                }
                if (Key.r(jN3, mappedKeys3.ck())) {
                    return KeyCommand.f19709S;
                }
                if (Key.r(jN3, mappedKeys3.HI())) {
                    return KeyCommand.f19717g;
                }
                if (Key.r(jN3, mappedKeys3.qie()) ? true : Key.r(jN3, mappedKeys3.Ik())) {
                    return KeyCommand.Mx;
                }
                if (Key.r(jN3, mappedKeys3.t())) {
                    return KeyCommand.p5;
                }
                if (Key.r(jN3, mappedKeys3.Uo())) {
                    return KeyCommand.eF;
                }
                if (Key.r(jN3, mappedKeys3.Z())) {
                    return KeyCommand.P5;
                }
                if (Key.r(jN3, mappedKeys3.J2())) {
                    return KeyCommand.M7;
                }
                if (Key.r(jN3, mappedKeys3.O())) {
                    return KeyCommand.f19711U;
                }
                if (Key.r(jN3, mappedKeys3.XQ())) {
                    return KeyCommand.f19702G7;
                }
                return null;
            }
        };
    }

    public static final KeyMapping rl() {
        return f19726n;
    }
}
