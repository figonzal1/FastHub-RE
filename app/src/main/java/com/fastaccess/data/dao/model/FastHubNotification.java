// Generated file do not edit, generated by io.requery.processor.EntityProcessor
package com.fastaccess.data.dao.model;

import android.os.Parcel;

import java.util.Date;

import javax.annotation.Generated;

import io.requery.Persistable;
import io.requery.meta.AttributeBuilder;
import io.requery.meta.NumericAttribute;
import io.requery.meta.QueryAttribute;
import io.requery.meta.StringAttribute;
import io.requery.meta.Type;
import io.requery.meta.TypeBuilder;
import io.requery.proxy.BooleanProperty;
import io.requery.proxy.EntityProxy;
import io.requery.proxy.LongProperty;
import io.requery.proxy.Property;
import io.requery.proxy.PropertyState;
import io.requery.util.function.Function;
import io.requery.util.function.Supplier;

@Generated("io.requery.processor.EntityProcessor")
public class FastHubNotification extends AbstractFastHubNotification implements Persistable {
    public static final NumericAttribute<FastHubNotification, Date> DATE = 
    new AttributeBuilder<FastHubNotification, Date>("notification_date", Date.class)
    .setProperty(new Property<FastHubNotification, Date>() {
        @Override
        public Date get(FastHubNotification entity) {
            return entity.date;
        }

        @Override
        public void set(FastHubNotification entity, Date value) {
            entity.date = value;
        }
    })
    .setPropertyName("date")
    .setPropertyState(new Property<FastHubNotification, PropertyState>() {
        @Override
        public PropertyState get(FastHubNotification entity) {
            return entity.$date_state;
        }

        @Override
        public void set(FastHubNotification entity, PropertyState value) {
            entity.$date_state = value;
        }
    })
    .setGenerated(false)
    .setReadOnly(false)
    .setLazy(false)
    .setNullable(true)
    .setUnique(false)
    .buildNumeric();

    public static final QueryAttribute<FastHubNotification, Boolean> READ = 
    new AttributeBuilder<FastHubNotification, Boolean>("read", boolean.class)
    .setProperty(new BooleanProperty<FastHubNotification>() {
        @Override
        public Boolean get(FastHubNotification entity) {
            return entity.read;
        }

        @Override
        public void set(FastHubNotification entity, Boolean value) {
            if(value != null) {
                entity.read = value;
            }
        }

        @Override
        public boolean getBoolean(FastHubNotification entity) {
            return entity.read;
        }

        @Override
        public void setBoolean(FastHubNotification entity, boolean value) {
            entity.read = value;
        }
    })
    .setPropertyName("read")
    .setPropertyState(new Property<FastHubNotification, PropertyState>() {
        @Override
        public PropertyState get(FastHubNotification entity) {
            return entity.$read_state;
        }

        @Override
        public void set(FastHubNotification entity, PropertyState value) {
            entity.$read_state = value;
        }
    })
    .setGenerated(false)
    .setReadOnly(false)
    .setLazy(false)
    .setNullable(true)
    .setUnique(false)
    .build();

    public static final StringAttribute<FastHubNotification, String> BODY = 
    new AttributeBuilder<FastHubNotification, String>("body", String.class)
    .setProperty(new Property<FastHubNotification, String>() {
        @Override
        public String get(FastHubNotification entity) {
            return entity.body;
        }

        @Override
        public void set(FastHubNotification entity, String value) {
            entity.body = value;
        }
    })
    .setPropertyName("body")
    .setPropertyState(new Property<FastHubNotification, PropertyState>() {
        @Override
        public PropertyState get(FastHubNotification entity) {
            return entity.$body_state;
        }

        @Override
        public void set(FastHubNotification entity, PropertyState value) {
            entity.$body_state = value;
        }
    })
    .setGenerated(false)
    .setReadOnly(false)
    .setLazy(false)
    .setNullable(true)
    .setUnique(false)
    .buildString();

    public static final StringAttribute<FastHubNotification, String> TITLE = 
    new AttributeBuilder<FastHubNotification, String>("title", String.class)
    .setProperty(new Property<FastHubNotification, String>() {
        @Override
        public String get(FastHubNotification entity) {
            return entity.title;
        }

        @Override
        public void set(FastHubNotification entity, String value) {
            entity.title = value;
        }
    })
    .setPropertyName("title")
    .setPropertyState(new Property<FastHubNotification, PropertyState>() {
        @Override
        public PropertyState get(FastHubNotification entity) {
            return entity.$title_state;
        }

        @Override
        public void set(FastHubNotification entity, PropertyState value) {
            entity.$title_state = value;
        }
    })
    .setGenerated(false)
    .setReadOnly(false)
    .setLazy(false)
    .setNullable(true)
    .setUnique(false)
    .buildString();

    public static final QueryAttribute<FastHubNotification, AbstractFastHubNotification.NotificationType> TYPE = 
    new AttributeBuilder<FastHubNotification, AbstractFastHubNotification.NotificationType>("type", AbstractFastHubNotification.NotificationType.class)
    .setProperty(new Property<FastHubNotification, AbstractFastHubNotification.NotificationType>() {
        @Override
        public AbstractFastHubNotification.NotificationType get(FastHubNotification entity) {
            return entity.type;
        }

        @Override
        public void set(FastHubNotification entity,
                AbstractFastHubNotification.NotificationType value) {
            entity.type = value;
        }
    })
    .setPropertyName("type")
    .setPropertyState(new Property<FastHubNotification, PropertyState>() {
        @Override
        public PropertyState get(FastHubNotification entity) {
            return entity.$type_state;
        }

        @Override
        public void set(FastHubNotification entity, PropertyState value) {
            entity.$type_state = value;
        }
    })
    .setGenerated(false)
    .setReadOnly(false)
    .setLazy(false)
    .setNullable(true)
    .setUnique(false)
    .build();

    public static final NumericAttribute<FastHubNotification, Long> ID = 
    new AttributeBuilder<FastHubNotification, Long>("id", long.class)
    .setProperty(new LongProperty<FastHubNotification>() {
        @Override
        public Long get(FastHubNotification entity) {
            return entity.id;
        }

        @Override
        public void set(FastHubNotification entity, Long value) {
            entity.id = value;
        }

        @Override
        public long getLong(FastHubNotification entity) {
            return entity.id;
        }

        @Override
        public void setLong(FastHubNotification entity, long value) {
            entity.id = value;
        }
    })
    .setPropertyName("id")
    .setPropertyState(new Property<FastHubNotification, PropertyState>() {
        @Override
        public PropertyState get(FastHubNotification entity) {
            return entity.$id_state;
        }

        @Override
        public void set(FastHubNotification entity, PropertyState value) {
            entity.$id_state = value;
        }
    })
    .setKey(true)
    .setGenerated(true)
    .setReadOnly(true)
    .setLazy(false)
    .setNullable(false)
    .setUnique(false)
    .buildNumeric();

    public static final Type<FastHubNotification> $TYPE = new TypeBuilder<FastHubNotification>(FastHubNotification.class, "FastHubNotification")
    .setBaseType(AbstractFastHubNotification.class)
    .setCacheable(true)
    .setImmutable(false)
    .setReadOnly(false)
    .setStateless(false)
    .setView(false)
    .setFactory(new Supplier<FastHubNotification>() {
        @Override
        public FastHubNotification get() {
            return new FastHubNotification();
        }
    })
    .setProxyProvider(new Function<FastHubNotification, EntityProxy<FastHubNotification>>() {
        @Override
        public EntityProxy<FastHubNotification> apply(FastHubNotification entity) {
            return entity.$proxy;
        }
    })
    .addAttribute(READ)
    .addAttribute(DATE)
    .addAttribute(TITLE)
    .addAttribute(ID)
    .addAttribute(BODY)
    .addAttribute(TYPE)
    .build();

    private PropertyState $date_state;

    private PropertyState $read_state;

    private PropertyState $body_state;

    private PropertyState $title_state;

    private PropertyState $type_state;

    private PropertyState $id_state;

    private final transient EntityProxy<FastHubNotification> $proxy = new EntityProxy<FastHubNotification>(this, $TYPE);

    protected FastHubNotification(Parcel in) {
        super(in);
    }

    public FastHubNotification() {
    }

    public Date getDate() {
        return $proxy.get(DATE);
    }

    public void setDate(Date date) {
        $proxy.set(DATE, date);
    }

    public boolean isRead() {
        return $proxy.get(READ);
    }

    public void setRead(boolean read) {
        $proxy.set(READ, read);
    }

    public String getBody() {
        return $proxy.get(BODY);
    }

    public void setBody(String body) {
        $proxy.set(BODY, body);
    }

    public String getTitle() {
        return $proxy.get(TITLE);
    }

    public void setTitle(String title) {
        $proxy.set(TITLE, title);
    }

    public AbstractFastHubNotification.NotificationType getType() {
        return $proxy.get(TYPE);
    }

    public void setType(AbstractFastHubNotification.NotificationType type) {
        $proxy.set(TYPE, type);
    }

    public long getId() {
        return $proxy.get(ID);
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof FastHubNotification && ((FastHubNotification)obj).$proxy.equals(this.$proxy);
    }

    @Override
    public int hashCode() {
        return $proxy.hashCode();
    }
}