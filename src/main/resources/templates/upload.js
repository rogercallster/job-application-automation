const url = 'upload'
const form = document.querySelector('createUser')

form.addEventListener('clicked', e => {
  e.preventDefault()
console.log("uploading");
  const files = document.querySelector('[type=file]').files
  const formData = new FormData()

  for (let i = 0; i < files.length; i++) {
    let file = files[i]

    formData.append('files[]', file)
  }

  fetch(url, {
    method: 'POST',
    body: formData,
  }).then(response => {
    console.log(response)
  })
})