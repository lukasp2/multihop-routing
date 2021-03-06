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



/**
 * Listener for all global interactions.
 */
public interface HlaInteractionListener {

   /**
    * This method is invoked when an HLA <code>HLAinteractionRoot.Request</code> interaction is received,
    * (or is sent locally).
    *
    * @param local <code>true</code> if the interaction was sent locally <code>false</code> otherwise
    * @param parameters contains value for the parameters
    * @param timeStamp the time when the interaction was sent
    * @param logicalTime the logical time when the interaction was sent
    */
   void request(
      boolean local,
      HlaInteractionManager.HlaRequestParameters parameters,
      HlaTimeStamp timeStamp,
      HlaLogicalTime logicalTime
   );

   /**
    * This method is invoked when an HLA <code>HLAinteractionRoot.Response</code> interaction is received,
    * (or is sent locally).
    *
    * @param local <code>true</code> if the interaction was sent locally <code>false</code> otherwise
    * @param parameters contains value for the parameters
    * @param timeStamp the time when the interaction was sent
    * @param logicalTime the logical time when the interaction was sent
    */
   void response(
      boolean local,
      HlaInteractionManager.HlaResponseParameters parameters,
      HlaTimeStamp timeStamp,
      HlaLogicalTime logicalTime
   );


   /**
    * An abstract adapter class that implements the HlaInteractionListener interface with empty methods.
    * It might be used as a base class for a listener.
    */
   public abstract static class Adapter implements HlaInteractionListener {
      public void request(
         boolean local,
         HlaInteractionManager.HlaRequestParameters parameters,
         HlaTimeStamp timeStamp,
         HlaLogicalTime logicalTime
       ) {}

      public void response(
         boolean local,
         HlaInteractionManager.HlaResponseParameters parameters,
         HlaTimeStamp timeStamp,
         HlaLogicalTime logicalTime
       ) {}

   }
}
