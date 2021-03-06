package devstudio.generatedcode;

/*
 * DO NOT EDIT!
 * 
 * Automatically generated source code by Pitch Developer Studio
 * Licensed to LP Internal Development 2020
 *
 * Copyright (C) 2006-2020 Pitch Technologies AB. All rights reserved.
 * Use is subject to license terms.
 */

import devstudio.generatedcode.exceptions.*;

/**
 * Interface used to represent an object instance.
 * <p>
 * This class is <code>ThreadSafe</code> as defined by <i>Java Concurrency in Practice</i>,
 * see <a href="http://jcip.net/annotations/doc/net/jcip/annotations/package-summary.html">jcip.net</a>.
 */
public interface HlaCommunicationNetworkStatus extends HlaCommunicationNetworkStatusAttributes, HlaObjectInstanceBase {


   /**
    * Tells if this HlaCommunicationNetworkStatus object instance is local or remote.
    * An local instance is an instance that you have originally created.
    *
    * @return true if local.
    */
    boolean isLocal();

   /**
    * Tells if this HlaCommunicationNetworkStatus is initialized.
    * An object is initialized if all attributes marked with <i>Initialized</i> has a value.
    *
    * @return true if initialized.
    */
    boolean isInitialized();

   /**
    * Tells if this HlaCommunicationNetworkStatus is within interest.
    * A removed instance is never within interest.
    *
    * @return true if within interest.
    */
   boolean isWithinInterest();

   /**
    * Tells if this HlaCommunicationNetworkStatus has been removed.
    *
    * @return true if removed.
    */
   boolean isRemoved();

   /**
    * Gets an immutable snapshot of the HlaCommunicationNetworkStatus's attributes.
    * The attributes returned are always the most recent values available
    * for the attributes.
    *
    * @return attribute snapshot.
    */
    HlaCommunicationNetworkStatusAttributes getHlaCommunicationNetworkStatusAttributes();

   /**
    * Gets an updater.
    * The updater is used to update a set of attributes on the HlaCommunicationNetworkStatus in
    * an atomic fashion. The update object may only be used for at most
    * one update.
    *
    * @return updater object.
    */
    HlaCommunicationNetworkStatusUpdater getHlaCommunicationNetworkStatusUpdater();

   /**
    * Get the <code>HLA instance name</code>.
    *
    * @return the <code>HLA instance name</code>.
    */
   String getHlaInstanceName();

   /**
    * Get the encoded <code>HLA instance handle</code>.
    *
    * @return the encoded <code>HLA instance handle</code>.
    */
   byte[] getEncodedHlaObjectInstanceHandle();

   /**
    * Get the object class type for this object instance.
    *
    * @return the object class type for this object instance
    */
   ObjectClassType getClassType();

   /**
    * Adds a listener.
    * The listener is notified when any attribute of this object is updated.
    * This listener is also called when an interaction is sent to this object.
    * This method is idempotent.
    * To make sure that no attribute updates arrive before adding the listener, use: {@link devstudio.generatedcode.HlaCommunicationNetworkStatusManager#addHlaCommunicationNetworkStatusDefaultInstanceListener(HlaCommunicationNetworkStatusListener listener)}.
    *
    * @param listener The listener to add.
    */
    void addHlaCommunicationNetworkStatusListener(HlaCommunicationNetworkStatusListener listener);

   /**
    * Removes a listener.
    * This method is idempotent. Trying to remove a non-registered listener is equivalent to a no-op.
    *
    * @param listener The listener to remove.
    */
    void removeHlaCommunicationNetworkStatusListener(HlaCommunicationNetworkStatusListener listener);

   /**
    * Adds a valueListener.
    * The valueListener is notified when any attribute of this object is updated.
    * Note that the attribute values that are notified are not guaranteed to
    * be the latest available values for that attribute.
    * This method is idempotent.
    * To make sure that no attribute updates arrive before adding the listener, use: {@link devstudio.generatedcode.HlaCommunicationNetworkStatusManager#addHlaCommunicationNetworkStatusDefaultInstanceValueListener(HlaCommunicationNetworkStatusValueListener valueListener)}.
    *
    * @param valueListener The valueListener to add.
    */
    void addHlaCommunicationNetworkStatusValueListener(HlaCommunicationNetworkStatusValueListener valueListener);

   /**
    * Removes a valueListener.
    * This method is idempotent. Trying to remove a non-registered valueListener is equivalent to a no-op.
    *
    * @param valueListener The valueListener to remove.
    */
    void removeHlaCommunicationNetworkStatusValueListener(HlaCommunicationNetworkStatusValueListener valueListener);

   /**
    * Get the HlaFederateId for the federate that created this HlaCommunicationNetworkStatus instance
    *
    * @return The federate id for the federate that created this instance
    */
    HlaFederateId getProducingFederate();

   /**
    * Get the HlaFederateId for the federate that last updated the given attribute
    *
    * @param attribute the attribute to get the last producing federate for
    *
    * @return The federate id for the federate that last updated the attribute
    */
    HlaFederateId getLastProducingFederate(Attribute attribute);
}
