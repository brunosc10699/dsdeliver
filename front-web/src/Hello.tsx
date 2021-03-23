type Props = {
    name : string;
}

function Hello({ name }: Props) {
    return (
        <div>
            <h1>Salut {name}!</h1>
        </div>
    )
}

export default Hello;