/**
  * @fileoverview Externs for FastClick 1.0.6
  * @see https://github.com/ftlabs/fastclick
  * @externs
  * Copy of https://github.com/openlayers/ol3/blob/8882e85cb45768e851d80777542640e5c62ef909/externs/fastclick.js
  */

/**
  * @type {Object}
  * @const
  */
var FastClick = {};

/**
  * @typedef {{
  *   touchBoundary: (number|undefined),
  *   tapDelay: (number|undefined),
  *   tapTimeout: (number|undefined)
  * }}
  */
FastClick.AttachOptions;

/**
  * @param {Element} layer
  * @param {FastClick.AttachOptions=} opt_options
  */
FastClick.attach = function(layer, opt_options) {};
