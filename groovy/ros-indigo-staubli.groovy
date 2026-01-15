node {
    git url: 'https://github.com/ros-industrial/staubli.git', branch: 'indigo-devel'
    registerROS('ros:indigo-ros-base', [
        'libopenblas-dev',
        'ros-indigo-moveit-core',
        'ros-indigo-tf-conversions'
    ], [])
}
