function form() {
  let msg = "";
  for (
    let i = 0;
    i < document.getElementById("form").elements.length - 1;
    ++i
  ) {
    msg = msg.concat(
      document.getElementById("form").elements[i].name,
      ": ",
      document.getElementById("form").elements[i].value,
      "\n"
    );
  }
  alert(msg);
}
