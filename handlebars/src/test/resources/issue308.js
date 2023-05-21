Handlebars.registerHelper('dowork', function(context, options) {
  var ret = '', i, j;
  for (i = 0, j = context.length; i < j; i += 1) {
    if (context[i].name === 'pato') {
      context[i].newval = 'friend';
    } else {
      context[i]['newval'] = 'colleague';
    }
    ret += options.fn(context[i]);
  }
  return ret;
});
