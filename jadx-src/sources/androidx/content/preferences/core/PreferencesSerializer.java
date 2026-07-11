package androidx.content.preferences.core;

import androidx.content.core.CorruptionException;
import androidx.content.core.okio.OkioSerializer;
import androidx.content.preferences.PreferencesMapCompat;
import androidx.content.preferences.PreferencesProto;
import androidx.content.preferences.core.Preferences;
import androidx.content.preferences.protobuf.ByteString;
import androidx.content.preferences.protobuf.GeneratedMessageLite;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okio.BufferedSink;
import okio.BufferedSource;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011H\u0096@¢\u0006\u0004\b\u0013\u0010\u0014J \u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015H\u0096@¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Landroidx/datastore/preferences/core/PreferencesSerializer;", "Landroidx/datastore/core/okio/OkioSerializer;", "Landroidx/datastore/preferences/core/Preferences;", "<init>", "()V", "", "value", "Landroidx/datastore/preferences/PreferencesProto$Value;", "O", "(Ljava/lang/Object;)Landroidx/datastore/preferences/PreferencesProto$Value;", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "Landroidx/datastore/preferences/core/MutablePreferences;", "mutablePreferences", "", "t", "(Ljava/lang/String;Landroidx/datastore/preferences/PreferencesProto$Value;Landroidx/datastore/preferences/core/MutablePreferences;)V", "Lokio/BufferedSource;", "source", c.f62177j, "(Lokio/BufferedSource;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lokio/BufferedSink;", "sink", "J2", "(Landroidx/datastore/preferences/core/Preferences;Lokio/BufferedSink;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "nr", "()Landroidx/datastore/preferences/core/Preferences;", "defaultValue", "datastore-preferences-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPreferencesSerializer.jvmAndroid.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PreferencesSerializer.jvmAndroid.kt\nandroidx/datastore/preferences/core/PreferencesSerializer\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,114:1\n215#2,2:115\n*S KotlinDebug\n*F\n+ 1 PreferencesSerializer.jvmAndroid.kt\nandroidx/datastore/preferences/core/PreferencesSerializer\n*L\n50#1:115,2\n*E\n"})
public final class PreferencesSerializer implements OkioSerializer<Preferences> {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final PreferencesSerializer f37706n = new PreferencesSerializer();

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PreferencesProto.Value.ValueCase.values().length];
            try {
                iArr[PreferencesProto.Value.ValueCase.BOOLEAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PreferencesProto.Value.ValueCase.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PreferencesProto.Value.ValueCase.DOUBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PreferencesProto.Value.ValueCase.INTEGER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PreferencesProto.Value.ValueCase.LONG.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[PreferencesProto.Value.ValueCase.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[PreferencesProto.Value.ValueCase.STRING_SET.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[PreferencesProto.Value.ValueCase.BYTES.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[PreferencesProto.Value.ValueCase.VALUE_NOT_SET.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final PreferencesProto.Value O(Object value) {
        if (value instanceof Boolean) {
            GeneratedMessageLite generatedMessageLiteBuild = PreferencesProto.Value.dR0().g(((Boolean) value).booleanValue()).build();
            Intrinsics.checkNotNullExpressionValue(generatedMessageLiteBuild, "newBuilder().setBoolean(value).build()");
            return (PreferencesProto.Value) generatedMessageLiteBuild;
        }
        if (value instanceof Float) {
            GeneratedMessageLite generatedMessageLiteBuild2 = PreferencesProto.Value.dR0().fD(((Number) value).floatValue()).build();
            Intrinsics.checkNotNullExpressionValue(generatedMessageLiteBuild2, "newBuilder().setFloat(value).build()");
            return (PreferencesProto.Value) generatedMessageLiteBuild2;
        }
        if (value instanceof Double) {
            GeneratedMessageLite generatedMessageLiteBuild3 = PreferencesProto.Value.dR0().iF(((Number) value).doubleValue()).build();
            Intrinsics.checkNotNullExpressionValue(generatedMessageLiteBuild3, "newBuilder().setDouble(value).build()");
            return (PreferencesProto.Value) generatedMessageLiteBuild3;
        }
        if (value instanceof Integer) {
            GeneratedMessageLite generatedMessageLiteBuild4 = PreferencesProto.Value.dR0().E2(((Number) value).intValue()).build();
            Intrinsics.checkNotNullExpressionValue(generatedMessageLiteBuild4, "newBuilder().setInteger(value).build()");
            return (PreferencesProto.Value) generatedMessageLiteBuild4;
        }
        if (value instanceof Long) {
            GeneratedMessageLite generatedMessageLiteBuild5 = PreferencesProto.Value.dR0().e(((Number) value).longValue()).build();
            Intrinsics.checkNotNullExpressionValue(generatedMessageLiteBuild5, "newBuilder().setLong(value).build()");
            return (PreferencesProto.Value) generatedMessageLiteBuild5;
        }
        if (value instanceof String) {
            GeneratedMessageLite generatedMessageLiteBuild6 = PreferencesProto.Value.dR0().X((String) value).build();
            Intrinsics.checkNotNullExpressionValue(generatedMessageLiteBuild6, "newBuilder().setString(value).build()");
            return (PreferencesProto.Value) generatedMessageLiteBuild6;
        }
        if (value instanceof Set) {
            PreferencesProto.Value.Builder builderDR0 = PreferencesProto.Value.dR0();
            PreferencesProto.StringSet.Builder builderEF = PreferencesProto.StringSet.eF();
            Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
            GeneratedMessageLite generatedMessageLiteBuild7 = builderDR0.T(builderEF.g((Set) value)).build();
            Intrinsics.checkNotNullExpressionValue(generatedMessageLiteBuild7, "newBuilder()\n           …                 .build()");
            return (PreferencesProto.Value) generatedMessageLiteBuild7;
        }
        if (value instanceof byte[]) {
            GeneratedMessageLite generatedMessageLiteBuild8 = PreferencesProto.Value.dR0().te(ByteString.qie((byte[]) value)).build();
            Intrinsics.checkNotNullExpressionValue(generatedMessageLiteBuild8, "newBuilder().setBytes(By….copyFrom(value)).build()");
            return (PreferencesProto.Value) generatedMessageLiteBuild8;
        }
        throw new IllegalStateException("PreferencesSerializer does not support type: " + value.getClass().getName());
    }

    @Override // androidx.content.core.okio.OkioSerializer
    public Object n(BufferedSource bufferedSource, Continuation continuation) throws CorruptionException {
        PreferencesProto.PreferenceMap preferenceMapN = PreferencesMapCompat.INSTANCE.n(bufferedSource.inputStream());
        MutablePreferences mutablePreferencesRl = PreferencesFactory.rl(new Preferences.Pair[0]);
        Map mapP5 = preferenceMapN.P5();
        Intrinsics.checkNotNullExpressionValue(mapP5, "preferencesProto.preferencesMap");
        for (Map.Entry entry : mapP5.entrySet()) {
            String name = (String) entry.getKey();
            PreferencesProto.Value value = (PreferencesProto.Value) entry.getValue();
            PreferencesSerializer preferencesSerializer = f37706n;
            Intrinsics.checkNotNullExpressionValue(name, "name");
            Intrinsics.checkNotNullExpressionValue(value, "value");
            preferencesSerializer.t(name, value, mutablePreferencesRl);
        }
        return mutablePreferencesRl.nr();
    }

    private PreferencesSerializer() {
    }

    private final void t(String name, PreferencesProto.Value value, MutablePreferences mutablePreferences) throws CorruptionException {
        int i2;
        PreferencesProto.Value.ValueCase valueCaseK = value.k();
        if (valueCaseK == null) {
            i2 = -1;
        } else {
            i2 = WhenMappings.$EnumSwitchMapping$0[valueCaseK.ordinal()];
        }
        switch (i2) {
            case -1:
                throw new CorruptionException("Value case is null.", null, 2, null);
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
                mutablePreferences.mUb(PreferencesKeys.n(name), Boolean.valueOf(value.FX()));
                return;
            case 2:
                mutablePreferences.mUb(PreferencesKeys.nr(name), Float.valueOf(value.a()));
                return;
            case 3:
                mutablePreferences.mUb(PreferencesKeys.t(name), Double.valueOf(value.D()));
                return;
            case 4:
                mutablePreferences.mUb(PreferencesKeys.O(name), Integer.valueOf(value.I()));
                return;
            case 5:
                mutablePreferences.mUb(PreferencesKeys.J2(name), Long.valueOf(value.GR()));
                return;
            case 6:
                Preferences.Key keyUo = PreferencesKeys.Uo(name);
                String strNxk = value.Nxk();
                Intrinsics.checkNotNullExpressionValue(strNxk, "value.string");
                mutablePreferences.mUb(keyUo, strNxk);
                return;
            case 7:
                Preferences.Key keyKN = PreferencesKeys.KN(name);
                List listP5 = value.Y().p5();
                Intrinsics.checkNotNullExpressionValue(listP5, "value.stringSet.stringsList");
                mutablePreferences.mUb(keyKN, CollectionsKt.toSet(listP5));
                return;
            case 8:
                Preferences.Key keyRl = PreferencesKeys.rl(name);
                byte[] bArrFD = value.B().fD();
                Intrinsics.checkNotNullExpressionValue(bArrFD, "value.bytes.toByteArray()");
                mutablePreferences.mUb(keyRl, bArrFD);
                return;
            case 9:
                throw new CorruptionException("Value not set.", null, 2, null);
        }
    }

    @Override // androidx.content.core.okio.OkioSerializer
    /* JADX INFO: renamed from: J2, reason: merged with bridge method [inline-methods] */
    public Object rl(Preferences preferences, BufferedSink bufferedSink, Continuation continuation) {
        Map mapN = preferences.n();
        PreferencesProto.PreferenceMap.Builder builderEF = PreferencesProto.PreferenceMap.eF();
        for (Map.Entry entry : mapN.entrySet()) {
            builderEF.g(((Preferences.Key) entry.getKey()).getName(), O(entry.getValue()));
        }
        ((PreferencesProto.PreferenceMap) builderEF.build()).xMQ(bufferedSink.outputStream());
        return Unit.INSTANCE;
    }

    @Override // androidx.content.core.okio.OkioSerializer
    /* JADX INFO: renamed from: nr, reason: merged with bridge method [inline-methods] */
    public Preferences getDefaultValue() {
        return PreferencesFactory.n();
    }
}
