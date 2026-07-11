package androidx.content.preferences.protobuf;

import androidx.content.preferences.protobuf.MapEntryLite;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@CheckReturnValue
final class MapFieldSchemaLite implements MapFieldSchema {
    @Override // androidx.content.preferences.protobuf.MapFieldSchema
    public Object toImmutable(Object obj) {
        ((MapFieldLite) obj).az();
        return obj;
    }

    private static int n(int i2, Object obj, Object obj2) {
        MapFieldLite mapFieldLite = (MapFieldLite) obj;
        MapEntryLite mapEntryLite = (MapEntryLite) obj2;
        int iN = 0;
        if (mapFieldLite.isEmpty()) {
            return 0;
        }
        for (Map.Entry entry : mapFieldLite.entrySet()) {
            iN += mapEntryLite.n(i2, entry.getKey(), entry.getValue());
        }
        return iN;
    }

    private static MapFieldLite rl(Object obj, Object obj2) {
        MapFieldLite mapFieldLiteHI = (MapFieldLite) obj;
        MapFieldLite mapFieldLite = (MapFieldLite) obj2;
        if (!mapFieldLite.isEmpty()) {
            if (!mapFieldLiteHI.qie()) {
                mapFieldLiteHI = mapFieldLiteHI.HI();
            }
            mapFieldLiteHI.ty(mapFieldLite);
        }
        return mapFieldLiteHI;
    }

    @Override // androidx.content.preferences.protobuf.MapFieldSchema
    public Map forMapData(Object obj) {
        return (MapFieldLite) obj;
    }

    @Override // androidx.content.preferences.protobuf.MapFieldSchema
    public MapEntryLite.Metadata forMapMetadata(Object obj) {
        return ((MapEntryLite) obj).t();
    }

    @Override // androidx.content.preferences.protobuf.MapFieldSchema
    public Map forMutableMapData(Object obj) {
        return (MapFieldLite) obj;
    }

    @Override // androidx.content.preferences.protobuf.MapFieldSchema
    public boolean isImmutable(Object obj) {
        return !((MapFieldLite) obj).qie();
    }

    MapFieldSchemaLite() {
    }

    @Override // androidx.content.preferences.protobuf.MapFieldSchema
    public int getSerializedSize(int i2, Object obj, Object obj2) {
        return n(i2, obj, obj2);
    }

    @Override // androidx.content.preferences.protobuf.MapFieldSchema
    public Object mergeFrom(Object obj, Object obj2) {
        return rl(obj, obj2);
    }

    @Override // androidx.content.preferences.protobuf.MapFieldSchema
    public Object newMapField(Object obj) {
        return MapFieldLite.KN().HI();
    }
}
